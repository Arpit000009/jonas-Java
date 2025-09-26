package ms;

 class msoffice {
    String name;
    String ext;

    msoffice(String name, String ext) {
        this.name = name;
        this.ext = ext;
    }
}

class word extends msoffice {
    int nooflines;

    word(String name, String ext, int nooflines) {
        super(name, ext);
        this.nooflines = nooflines;
    }
}

class excel extends msoffice {
    int row;
    int column;

    excel(String name, String ext, int row, int column) {
        super(name, ext);
        this.row = row;
        this.column = column;
    }
}

class powerpoint extends msoffice {
    int slides;

    powerpoint(String name, String ext, int slides) {
        super(name, ext);
        this.slides = slides;
    }

}

 public class msofficedriver {
    public static void main(String[] args) {

        msoffice m = new word("new", "word", 20);
        word w = (word) m;
        msoffice m2 = new powerpoint("run", "powerpoint", 60);
        powerpoint p = (powerpoint) m2;
        System.out.println("the name of this file is" + w.name + "the extention is " + w.ext + "and it contains"
                + w.nooflines + "lines");
        System.out.println(
                "the name of this file is" + p.name + "the extention is " + p.ext + "and it contains" + p.slides
                        + "slides");
    }

}
