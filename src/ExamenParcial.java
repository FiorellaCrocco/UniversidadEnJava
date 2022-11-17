public class ExamenParcial extends Examen{
    private int numeroDeUnidad;
    private int numeroDeIntentos;

    public ExamenParcial(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    @Override
    public boolean consultarEstadoAprobacion() {
        if (this.notaEscrita >= 4){
            return true;
        } else {
            return false;
        }
    }

    public boolean determinarPosibilidadDeRecuperar(){
        if (this.numeroDeUnidad <= 3 && this.numeroDeIntentos < 3){
            return true;
        } else if (this.numeroDeUnidad > 3 && this.numeroDeIntentos < 2) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumeroDeUnidad() {
        return numeroDeUnidad;
    }

    public void setNumeroDeUnidad(int numeroDeUnidad) {
        this.numeroDeUnidad = numeroDeUnidad;
    }

    public int getNumeroDeIntentos() {
        return numeroDeIntentos;
    }

    public void setNumeroDeIntentos(int numeroDeIntentos) {
        this.numeroDeIntentos = numeroDeIntentos;
    }
}
