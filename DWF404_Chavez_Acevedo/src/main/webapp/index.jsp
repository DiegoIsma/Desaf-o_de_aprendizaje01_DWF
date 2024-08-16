<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tienda de Insumos Medicos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css"> <!-- Enlace al archivo CSS externo -->
</head>
<body>
<div class="container">
    <h1>Bienvenido a la Tienda de Insumos Medicos</h1>
    <div class="row" id="insumosGallery">
        <!-- Aquí se insertarán los insumos -->
    </div>
    <div class="text-center mt-4">
        <button id="loadApi" class="btn btn-primary">Cargar Datos desde API</button>
    </div>
    <div class="mt-5">
        <h2>Carrito de Compras</h2>
        <ul id="cartItems" class="list-group">
            <!-- Aquí se mostrarán los artículos del carrito -->
        </ul>
        <p class="mt-3"><strong>Total: $<span id="cartTotal">0.00</span></strong></p>
        <button id="clearCart" class="btn btn-danger">Vaciar Carrito</button>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
    let cart = [];

    function updateCart() {
        let cartItems = $("#cartItems");
        let cartTotal = 0;
        cartItems.empty();

        cart.forEach(function(item) {
            cartTotal += item.price;
            let cartItem = `
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    ${item.name}
                    <span>$${item.price.toFixed(2)}</span>
                </li>`;
            cartItems.append(cartItem);
        });

        $("#cartTotal").text(cartTotal.toFixed(2));
    }

    function addToCart(item) {
        cart.push(item);
        updateCart();
    }

    $("#loadApi").click(function() {
        $.getJSON("insumos", function(data) {
            let gallery = $("#insumosGallery");
            gallery.empty(); // Limpiar cualquier contenido anterior

            data.forEach(function(item) {
                let insumoDiv = `
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="${item.image}" alt="${item.name}" class="card-img-top img-fluid">
                            <div class="card-body text-center">
                                <h4 class="card-title">${item.name}</h4>
                                <p class="card-text">${item.description}</p>
                                <p class="card-text"><strong>Precio: $${item.price.toFixed(2)}</strong></p>
                                <button class="btn btn-success" onclick='addToCart(${JSON.stringify(item)})'>Agregar al Carrito</button>
                            </div>
                        </div>
                    </div>`;
                gallery.append(insumoDiv);
            });
        });
    });

    $("#clearCart").click(function() {
        cart = [];
        updateCart();
    });
</script>
</body>
</html>
