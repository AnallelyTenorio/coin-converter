package com.aluracursos.coinconverter.principal.modelos;

public class Convertidor {
    private String monedaBase;
    private String monedaAconvertir;
    private Float cantidadAConvertir;
    private Float factorDeConversion;
    private Float resultado;

    public Convertidor(String monedaBase, String monedaAconvertir, Float cantidadAConvertir, Float factorDeConversion, Float resultado){
        this.monedaBase = monedaBase;
        this.monedaAconvertir = monedaAconvertir;
        this.cantidadAConvertir = cantidadAConvertir;
        this.factorDeConversion = factorDeConversion;
        this.resultado = resultado;
    }

    public Convertidor(ConvertidorApi miConvertidorApi){
        this.monedaBase = miConvertidorApi.base_code();
        this.monedaAconvertir = miConvertidorApi.target_code();
        this.factorDeConversion = miConvertidorApi.conversion_rate();
        this.resultado = miConvertidorApi.conversion_result();
    }

    @Override
    public String toString() {
        return "Convertidor{" +
                "monedaAconvertir='" + monedaAconvertir + '\'' +
                ", cantidadAConvertir=" + cantidadAConvertir +
                ", factorDeConversion=" + factorDeConversion +
                ", monedaBase='" + monedaBase + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}

