package lab2;

public class Peleador {
    private String nombre;
    private Long nivelPoder;
    private Long Vida;
    private String habilidadesEspeciales;


    public Peleador(String nombre, Long nivelPoder, Long vida, String habilidadesEspeciales) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        Vida = vida;
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public void setNivelPoder(Long nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public void setHabilidadesEspeciales(String habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getNivelPoder() {
        return nivelPoder;
    }

    public String getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    @Override
    public String toString() {
        return "Persona{" + getNombre() + "(" +getNivelPoder() + ") de poder ";
    }
}
