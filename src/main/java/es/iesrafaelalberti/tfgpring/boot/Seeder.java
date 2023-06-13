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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
        Producto producto6 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto14 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto15 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto16 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto17 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto18 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto19 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto20 = new Producto("Collar de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
                "Anillo de diamantes, creado en oro de 18 quilates o platino, con un diamante central en talla brillante, engarzado en 6 delicadas garras de forma tradicional, para mostrar toda la luz de la gema. Es un solitario de diamantes tradicional que sin embargo presenta un brazo lleno de diseño y tendencia, con un doble perfil.",
                100f,
                "collar",
                "Mujer",
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
                null,
                "Oro",

                "mosqueton",
                null);

        Producto producto21 = new Producto("Anillo de diamante",
                "https://i.imgur.com/6mkk4WD.jpg",
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

        Producto producto22 = new Producto("Reloj deportivo",
                "https://i.imgur.com/6mkk4WD.jpg",
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
        productoRepository.save(producto12);
        productoRepository.save(producto14);
        productoRepository.save(producto15);
        productoRepository.save(producto16);
        productoRepository.save(producto17);
        productoRepository.save(producto18);
        productoRepository.save(producto19);
        productoRepository.save(producto20);
        productoRepository.save(producto21);
        productoRepository.save(producto22);




        Cliente cliente1 = new Cliente("Jose Antonio","peri02","Gonzalez Perez","a@a.com","password","21/10/2002",false);
        clienteRepository.save(cliente1);


        Pedido pedido1 = new Pedido("23/34/02", "Si no estoy, entregar en mi casa", cliente1, new HashSet<>());
        pedidoRepository.save(pedido1);

        ProductoPedido productoPedido1 = new ProductoPedido(1,pedido1,producto1);
        productoPedidoRepository.save(productoPedido1);


    }
}
