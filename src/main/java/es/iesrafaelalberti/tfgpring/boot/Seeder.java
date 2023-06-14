package es.iesrafaelalberti.tfgpring.boot;

import es.iesrafaelalberti.tfgpring.models.Cliente;
import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.models.Producto;
import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import es.iesrafaelalberti.tfgpring.repositories.ClienteRepository;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoPedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    ProductoPedidoRepository productoPedidoRepository;

    @Override
    public void run(String... args) throws Exception {

        Producto producto1 = new Producto("Anillo de diamante",
                "https://i.imgur.com/8dI7t5L.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto2 = new Producto("Anillo de diamante",
                "https://i.imgur.com/4Bik0an.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                null,
                null,
                null);
        Producto producto3 = new Producto("Anillo de diamante",
                "https://i.imgur.com/XB21l8w.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto4 = new Producto("Anillo de diamante",
                "https://i.imgur.com/0xwpco6.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto5 = new Producto("Anillo de diamante",
                "https://i.imgur.com/qGkaqi1.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto6 = new Producto("Reloj ORIENT",
                "https://i.imgur.com/0Ylf6tj.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto7 = new Producto("Anillo de diamante",
                "https://i.imgur.com/dUUdzpG.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto8 = new Producto("Anillo de diamante",
                "https://i.imgur.com/cCEqFas.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto9 = new Producto("Anillo de diamante",
                "https://i.imgur.com/NN8XSK3.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);
        Producto producto10 = new Producto("Anillo de diamante",
                "https://i.imgur.com/GnTw2V9.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto11 = new Producto("Anillo de diamante",
                "https://i.imgur.com/qZzwMKV.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto12 = new Producto("Anillo de diamante",
                "https://i.imgur.com/QmFexFE.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto13 = new Producto("Anillo de diamante",
                "https://i.imgur.com/ndQJ8YW.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto14 = new Producto("Reloj ORIENT oscuro",
                "https://i.imgur.com/JmHyvrs.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto15 = new Producto("Reloj dorado",
                "https://i.imgur.com/Nfwud1O.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto16 = new Producto("Collar de diamante",
                "https://i.imgur.com/j5wDEiV.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "collar",
                "Hombre",
                40f,
                null,
                null,
                null,
                null,
                null,

                null,
                null,
                null,
                null,
                null,
                "oro",
                "magnetico",
                null);

        Producto producto17 = new Producto("Collar de diamante",
                "https://i.imgur.com/SsDChXF.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "collar",
                "Mujer",
                50f,
                null,
                null,
                null,
                null,
                null,

                null,
                null,
                null,
                null,
                null,
                "oro",
                "mosqueton",
                null);

        Producto producto18 = new Producto("Reloj Maserati",
                "https://i.imgur.com/w5GJK6m.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto19 = new Producto("Reloj Maserati",
                "https://i.imgur.com/LiCuKTg.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto20 = new Producto("Reloj MVMT",
                "https://i.imgur.com/nvyu9AL.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "collar",
                "Mujer",
                70f,
                null,
                null,
                null,
                null,
                null,

                null,
                null,
                null,
                null,
                null,
                "Oro",

                "mosqueton",
                null);

        Producto producto21 = new Producto("Reloj M-FORCE",
                "https://i.imgur.com/DT3kAV4.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "anillo",
                "Hombre",
                62f,
                null,
                null,
                null,
                null,
                null,

                "azul",
                "14 gramos",
                "14K",
                "diamante",
                5L,
                "Oro",
                null,
                null);

        Producto producto22 = new Producto("Reloj Versace",
                "https://i.imgur.com/tlbw3yY.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "reloj",
                "Hombre",
                34f,
                "acero inoxidable",
                "cuero",
                "negro",
                "mecanico",
                100f,

                null,
                null,
                null,
                null,
                null,
                null,

                null,
                null);





        productoRepository.save(producto1);
        productoRepository.save(producto2);
        productoRepository.save(producto3);
        productoRepository.save(producto4);
        productoRepository.save(producto5);
        productoRepository.save(producto6);
        productoRepository.save(producto7);
        productoRepository.save(producto8);
        productoRepository.save(producto9);
        productoRepository.save(producto10);
        productoRepository.save(producto11);
        productoRepository.save(producto12);
        productoRepository.save(producto13);
        productoRepository.save(producto14);
        productoRepository.save(producto15);
        productoRepository.save(producto16);
        productoRepository.save(producto17);
        productoRepository.save(producto18);
        productoRepository.save(producto19);
        productoRepository.save(producto20);
        productoRepository.save(producto21);
        productoRepository.save(producto22);




        Cliente cliente1 = new Cliente("Jose Antonio","peri02","Gonzalez Perez","a@a.com","password","21/10/2002",true);
        clienteRepository.save(cliente1);


        Pedido pedido1 = new Pedido("23/34/02", "Si no estoy, entregar en mi casa", cliente1, new HashSet<>());
        pedidoRepository.save(pedido1);

        ProductoPedido productoPedido1 = new ProductoPedido(1,pedido1,producto1);
        productoPedidoRepository.save(productoPedido1);


    }
}
