package com.example.java9;

public class Computer implements Cloneable {

    public String cpu;
    public Integer ram;
    public int hdd;
    public int usb;
    public int videocard;
    private int videocard10;

    public Computer(String cpu, Integer ram, int hdd, int usb, int videocard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.usb = usb;
        this.videocard = videocard;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }
    public String toString(String cpu, Integer ram, int hdd, int usb, int videocard) {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }

    public String toString(String cpu) {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }
    void srtr() {
        System.out.println("the morning does not begin with coffee");
    }

    public static void main(String[] args) {

        // Создал обЬект 1
        Computer Computer1 = new Computer("6", 8, 512, 4, 2);
        // Создал обЬект 2
        Computer Computer2 = new Computer("4", 16, 256, 10, 1);
        // TODO: 22.04.2022 Создал обЬект 3
        Computer Computer3 = new Computer("8", 4, 1024, 2, 4);
        // TODO: 23.04.2022 обЬект 4
        Computer Computer4 = new Computer();

        System.out.println(Computer1.toString());
        System.out.println(Computer2.toString("10"));
        System.out.println(Computer3.toString());
        System.out.println(Computer4.toString());
        Computer4.srtr();
    }



}