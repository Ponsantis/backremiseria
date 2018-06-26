package com.cet001.icaro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1044152195801582698L;
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private double saldo;
    private double limiteDeCredito;
    private List<TelefonoCliente> telefonos = new ArrayList<>();
    private List<MovimientoDeSaldo> movSal = new ArrayList<>();
    private List<Viaje> viajes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apellido, double saldo, String direccion, double limiteDeCredito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        this.direccion = direccion;
        this.limiteDeCredito = limiteDeCredito;
    }

    public void sumSaldo(double importe) {
        saldo = this.saldo + importe;
    }

    public void subtractSaldo(double importe) {
        saldo = this.saldo - importe;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + ", direccion=" + direccion + ", limiteDeCredito=" + limiteDeCredito + ", telefonos=" + telefonos + ", movSal=" + movSal + ", viajes=" + viajes + '}';
    }

    //métodos setters & getters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public List<TelefonoCliente> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TelefonoCliente> telefonos) {
        this.telefonos = telefonos;
    }

    public List<MovimientoDeSaldo> getMovSal() {
        return movSal;
    }

    public void setMovSal(List<MovimientoDeSaldo> movSal) {
        this.movSal = movSal;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

}
