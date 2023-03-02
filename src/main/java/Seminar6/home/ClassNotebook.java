package Seminar6.home;

import java.util.Objects;

public class ClassNotebook {
    private String id;
    private String model;
    private String color;
    private String RAM;
    private String CPU;


    public ClassNotebook(String id, String model, String color, String RAM, String CPU) {
        this.id = id;
        this.model = model;
        this.RAM = RAM;
        this.color = color;
        this.CPU = CPU;
    }

    public ClassNotebook() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "ClassNoteBook{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", CPU='" + CPU + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassNotebook notebook = (ClassNotebook) o;
        return Objects.equals(model, notebook.model) && Objects.equals(color, notebook.color) && Objects.equals(RAM, notebook.RAM) && Objects.equals(CPU, notebook.CPU);
    }


    public void printInfo() {
        System.out.printf("ID: %s, Model: %s, Color: %s, RAM: %s, CPU: %s%n", id, model, color, RAM, CPU);
    }
}

