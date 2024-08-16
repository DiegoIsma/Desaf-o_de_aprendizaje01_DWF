package com.example.dwf404_chavez_acevedo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/insumos")
public class InsumosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Configurar la respuesta para que sea de tipo JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // JSON con la lista de insumos
        String jsonResponse = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Mascarilla Quirúrgica\",\n" +
                "    \"description\": \"Mascarilla de tres capas, uso médico.\",\n" +
                "    \"price\": 12.5,\n" +
                "    \"image\": \"https://www.grupobillingham.com/blog/wp-content/uploads/2020/06/mascarilla-tipo-I.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Guantes de Látex\",\n" +
                "    \"description\": \"Guantes desechables, talla M.\",\n" +
                "    \"price\": 15,\n" +
                "    \"image\": \"https://cbk.pe/wp-content/uploads/2020/11/guantes-de-latex-estirilizado-sterilix.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"name\": \"Termómetro Digital\",\n" +
                "    \"description\": \"Termómetro digital infrarrojo, sin contacto.\",\n" +
                "    \"price\": 45,\n" +
                "    \"image\": \"https://t1.uc.ltmcdn.com/es/posts/8/1/9/como_usar_un_termometro_digital_34918_paso_1_600.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"name\": \"Bata Médica\",\n" +
                "    \"description\": \"Bata desechable, resistente a líquidos.\",\n" +
                "    \"price\": 25,\n" +
                "    \"image\": \"https://anadeshop.com/media/catalog/product/cache/1/image/600x/9df78eab33525d08d6e5fb8d27136e95/b/a/bata-laboratorio-31db-47000-pid0117-1.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 5,\n" +
                "    \"name\": \"Oxímetro de Pulso\",\n" +
                "    \"description\": \"Oxímetro para medir saturación de oxígeno.\",\n" +
                "    \"price\": 30,\n" +
                "    \"image\": \"https://diabetes-club.mx/cdn/shop/products/OX-01.png?v=1592882309\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 6,\n" +
                "    \"name\": \"Desinfectante de Manos\",\n" +
                "    \"description\": \"Gel desinfectante para manos, 500ml.\",\n" +
                "    \"price\": 5,\n" +
                "    \"image\": \"https://www.asepeyo.es/wp-content/uploads/gel-desinfectante-manos-e1588577729380.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 7,\n" +
                "    \"name\": \"Cubrebocas N95\",\n" +
                "    \"description\": \"Cubrebocas de alta filtración, uso médico.\",\n" +
                "    \"price\": 20,\n" +
                "    \"image\": \"https://m.media-amazon.com/images/I/715pf+2EjwL.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 8,\n" +
                "    \"name\": \"Alcohol Isopropílico\",\n" +
                "    \"description\": \"Alcohol isopropílico al 70%, 1 litro.\",\n" +
                "    \"price\": 8,\n" +
                "    \"image\": \"https://comeind.com.mx/wp-content/uploads/2022/01/041-0015.png\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 9,\n" +
                "    \"name\": \"Esfigmomanómetro\",\n" +
                "    \"description\": \"Esfigmomanómetro manual con estetoscopio.\",\n" +
                "    \"price\": 50,\n" +
                "    \"image\": \"https://www.emedicalbox.com/wp-content/uploads/2019/04/tensiometro.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 10,\n" +
                "    \"name\": \"Kit de Sutura\",\n" +
                "    \"description\": \"Kit de sutura quirúrgico, estéril.\",\n" +
                "    \"price\": 35,\n" +
                "    \"image\": \"https://electrolabmedic.com/cdn/shop/files/PRACTICA_DE_SUTURA_KIT_900x.jpg?v=1718041043\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 11,\n" +
                "    \"name\": \"Jabón Antibacterial\",\n" +
                "    \"description\": \"Jabón líquido antibacterial, 1 litro.\",\n" +
                "    \"price\": 6.5,\n" +
                "    \"image\": \"https://pasteurio.vtexassets.com/arquivos/ids/170949-800-800?v=637989498610970000&width=800&height=800&aspect=true\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Bisturí Desechable\",\n" +
                "    \"description\": \"Bisturí desechable con hoja de acero.\",\n" +
                "    \"price\": 3,\n" +
                "    \"image\": \"https://www.fleming-sa.com/wp-content/uploads/BISTURI-DESECHABLE-10U.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 13,\n" +
                "    \"name\": \"Pinzas Quirúrgicas\",\n" +
                "    \"description\": \"Pinzas quirúrgicas de acero inoxidable.\",\n" +
                "    \"price\": 18,\n" +
                "    \"image\": \"https://bioslabchile.cl/web/wp-content/uploads/2021/09/UTB8HH2OkSbIXKJkSaefq6yasXXaS.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 14,\n" +
                "    \"name\": \"Tensiómetro Digital\",\n" +
                "    \"description\": \"Tensiómetro digital automático.\",\n" +
                "    \"price\": 60,\n" +
                "    \"image\": \"https://electrolabmedic.com/cdn/shop/products/VIDEOWEB_9_720x.jpg?v=1676138224\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 15,\n" +
                "    \"name\": \"Gorro Quirúrgico\",\n" +
                "    \"description\": \"Gorro desechable para uso quirúrgico.\",\n" +
                "    \"price\": 2.5,\n" +
                "    \"image\": \"https://hgsi.com.co/wp-content/uploads/2023/02/Gorros-quirurgicos-desechables-descartables-hg-servicios-e-innovaciones.jpg\"\n" +
                "  }\n" +
                "]";

        // Escribir el JSON en la respuesta
        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();
    }
}
