package ru.otus;


public enum Nominals {

    RUR5000 {
        public int getNominal() {
            return 5000;
        }
    },
    RUR2000 {
        public int getNominal() {
            return 2000;
        }
    },
    RUR1000 {
        public int getNominal() {
            return 1000;
        }
    },
    RUR500 {
        public int getNominal() {
            return 500;
        }
    },
    RUR200 {
        public int getNominal() {
            return 200;
        }
    },
    RUR100 {
        public int getNominal() {
            return 100;
        }
    },
    RUR50 {
        public int getNominal() {
            return 50;
        }
    };

    public abstract int getNominal();

}
