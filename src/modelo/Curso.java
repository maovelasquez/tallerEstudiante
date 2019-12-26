package modelo;

public class Curso {

    private String codigoCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;


    public Curso (String cod, String nom, int cred){
        this.nombreCurso = nom;
        this.codigoCurso = cod;
        this.creditos = cred;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int nuevosCreditos){
        this.creditos = nuevosCreditos;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }

    public String getDescripcion(){
        return "Retorna descripcion";
    }

    public boolean estaCalificado(){
        return false;
    }

}
