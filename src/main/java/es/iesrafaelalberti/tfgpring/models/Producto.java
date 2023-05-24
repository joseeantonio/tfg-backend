package es.iesrafaelalberti.tfgpring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String url_img;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    private Float precio;
    private String tipo;    //  MIRAR ESTE ATRIBUTO     (collar,pulsera,anillo)
    private String sexo;    //  (hombre,mujer,unisex)
    private String talla;   //  SEGUN EL TIPO DE PRODUCTO QUE SEA

    //RELOJES
    private Float diametro;
    private String materialCaja;
    private String materialCorrea;
    private String colorCorrea;
    private String tipoMovimiento;
    private boolean resistenteAgua;

    //ANILLOS
    private String color;
    private String peso;
    private String calidadMinima;
    private String piedra;
    private Long numeroPiedra;

    //COLLARES
    private String material;
    private String cierre;
    //peso tambien

    @JsonBackReference
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private Set<ProductoPedido> productoPedidos = new HashSet<>();

    public Producto() {
    }

    public Producto(String nombre, String url_img, String descripcion, Float precio, String tipo, String sexo, String talla, Float diametro, String materialCaja, String materialCorrea, String colorCorrea, String tipoMovimiento, boolean resistenteAgua, String color, String peso, String calidadMinima, String piedra, Long numeroPiedra, String material, String cierre, Set<ProductoPedido> productoPedidos) {
        this.nombre = nombre;
        this.url_img = url_img;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.sexo = sexo;
        this.talla = talla;
        this.diametro = diametro;
        this.materialCaja = materialCaja;
        this.materialCorrea = materialCorrea;
        this.colorCorrea = colorCorrea;
        this.tipoMovimiento = tipoMovimiento;
        this.resistenteAgua = resistenteAgua;
        this.color = color;
        this.peso = peso;
        this.calidadMinima = calidadMinima;
        this.piedra = piedra;
        this.numeroPiedra = numeroPiedra;
        this.material = material;
        this.cierre = cierre;
        this.productoPedidos = productoPedidos;
    }
}
