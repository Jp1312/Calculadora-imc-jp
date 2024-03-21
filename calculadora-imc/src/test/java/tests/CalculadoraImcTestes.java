package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    @Test
    public void AdultoMbaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "masculino"));
    }

    @Test
    public void AdultoMbaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "masculino"));
    }

    @Test
    public void AdultoMbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "masculino"));
    }

    @Test
    public void AdultoMpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "masculino"));
    }

    @Test
    public void AdultoMsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "masculino"));
    }

    @Test
    public void AdultoMobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "masculino"));
    }

    @Test
    public void AdultoMobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "masculino"));
    }

    @Test
    public void AdultoMobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "masculino"));
    }

    @Test
    public void FbaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "feminino"));
    }

    @Test
    public void AdultoFbaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "feminino"));
    }

    @Test
    public void AdultoFbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "feminino"));
    }

    @Test
    public void AdultoFpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "feminino"));
    }

    @Test
    public void AdultoFsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "feminino"));
    }

    @Test
    public void AdultoFobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "feminino"));
    }

    @Test
    public void AdultoFobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "feminino"));
    }

    @Test
    public void AdultoFobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "feminino"));
    }
    @Test
    public void IdosoMbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 70, "masculino"));
    }

    @Test
    public void IdosoMpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 70, 70, "masculino"));
    }

    @Test
    public void IdosoMsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 80, 70, "masculino"));
    }

    @Test
    public void IdosoMobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 70, "masculino"));
    }

    @Test
    public void IdosoMobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 100, 70, "masculino"));
    }

    @Test
    public void IdosoMobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 70, "masculino"));
    }
    @Test
    public void IdosaFbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.55, 40, 70, "feminino"));
    }

    @Test
    public void IdosaFpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.55, 60, 70, "feminino"));
    }

    @Test
    public void IdosaFsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.55, 70, 70, "feminino"));
    }

    @Test
    public void IdosaFobesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.55, 80, 70, "feminino"));
    }

    @Test
    public void IdosaFobesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.55, 90, 70, "feminino"));
    }

    @Test
    public void IdosaFobesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.55, 120, 70, "feminino"));
    }

    @Test
    public void CriancaMbaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.5, 35, 10, "masculino"));
    }

    @Test
    public void CriancaMpesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.5, 45, 12, "masculino"));
    }

    @Test
    public void CriancaMsobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.5, 65, 15, "masculino"));
    }

    @Test
    public void CriancaMobesidade() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(1.5, 75, 17, "masculino"));
    }


}

