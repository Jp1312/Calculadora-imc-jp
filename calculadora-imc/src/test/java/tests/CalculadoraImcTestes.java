package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    @Test
    public void hbaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "masculino"));
    }

    @Test
    public void hbaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "masculino"));
    }

    @Test
    public void hbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "masculino"));
    }

    @Test
    public void hpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "masculino"));
    }

    @Test
    public void hsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "masculino"));
    }

    @Test
    public void hobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "masculino"));
    }

    @Test
    public void hobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "masculino"));
    }

    @Test
    public void hobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "masculino"));
    }

    @Test
    public void mbaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "feminino"));
    }

    @Test
    public void mbaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "feminino"));
    }

    @Test
    public void mbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "feminino"));
    }

    @Test
    public void mpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "feminino"));
    }

    @Test
    public void msobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "feminino"));
    }

    @Test
    public void mobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "feminino"));
    }

    @Test
    public void mobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "feminino"));
    }

    @Test
    public void mobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "feminino"));
    }

}
