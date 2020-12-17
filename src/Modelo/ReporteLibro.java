package Modelo;

public class ReporteLibro {

    private int idlibro;
    private String titulo;
    private String isbn;
    private String paginas;
    private String año;
    private int sotck;
    private int Stock_disponibles;
    private String anombre;
    private String aapellidos;
    private String pnombre;
    private String enombre;

    public String getNombreCompleto() {
        return aapellidos.toUpperCase() + ", " + anombre;
    }

    public ReporteLibro(int idlibro, String titulo, String isbn, String paginas, String año, int Stock_disponibles, String anombre, String aapellidos, String pnombre, String enombre) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.año = año;
        this.Stock_disponibles = Stock_disponibles;
        this.anombre = anombre;
        this.aapellidos = aapellidos;
        this.pnombre = pnombre;
        this.enombre = enombre;

    }

    public ReporteLibro() {
    }

    public String getAapellidos() {
        return aapellidos;
    }

    public void setAapellidos(String aapellidos) {
        this.aapellidos = aapellidos;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getStock_disponibles() {
        return Stock_disponibles;
    }

    public void setStock_disponibles(int Stock_disponibles) {
        this.Stock_disponibles = Stock_disponibles;
    }

    public String getAnombre() {
        return anombre;
    }

    public void setAnombre(String anombre) {
        this.anombre = anombre;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getEnombre() {
        return enombre;
    }

    public void setEnombre(String enombre) {
        this.enombre = enombre;
    }

    public int getSotck() {
        return sotck;
    }

    public void setSotck(int sotck) {
        this.sotck = sotck;
    }

}
