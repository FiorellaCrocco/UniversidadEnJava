public class ExamenFinal extends Examen implements Comparable<ExamenFinal>{
    private double notaOral;
    private String descripcionTemaDado;

    public ExamenFinal(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    @Override
    public boolean consultarEstadoAprobacion() {
        if (this.notaEscrita >= 4 && this.notaOral >= 4){
            return true;
        } else {
            return false;
        }
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionTemaDado() {
        return descripcionTemaDado;
    }

    public void setDescripcionTemaDado(String descripcionTemaDado) {
        this.descripcionTemaDado = descripcionTemaDado;
    }

    @Override
    public int compareTo(ExamenFinal examen) {
        double promedioThis = (this.getNotaEscrita() + this.getNotaOral()) / 2;
        double promedioParam = (examen.getNotaEscrita() + examen.getNotaOral()) / 2;
        if (promedioThis > promedioParam){
            return 1;
        } else if (promedioThis < promedioParam){
            return -1;
        } else {
            return 0;
        }

    }
}
