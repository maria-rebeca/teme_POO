public class MatriceComplexe {

    public int linii;
    public int coloane;
    public Complex[][] matrice;

    public MatriceComplexe(int linii, int coloane) {
        this.linii = linii;
        this.coloane = coloane;
        this.matrice = new Complex[linii][coloane];
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                matrice[i][j] = new Complex(0, 0);
            }
        }
    }

    //adunare matrici

    public MatriceComplexe addMatrix(MatriceComplexe m) {
        if (this.linii != m.linii || this.coloane != m.coloane) {
            throw new IllegalArgumentException("Dimensiunile matricelor nu sunt egale pentru adunare.");
        }
        MatriceComplexe rezultat = new MatriceComplexe(this.linii, this.coloane);
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < this.coloane; j++) {
                rezultat.matrice[i][j] = this.matrice[i][j].aduna(m.matrice[i][j]);
            }
        }
        return rezultat;
    }

    public MatriceComplexe subMatrix(MatriceComplexe m) {
        if (this.linii != m.linii || this.coloane != m.coloane) {
            throw new IllegalArgumentException("Dimensiunile matricelor nu sunt egale pentru scadere.");
        }
        MatriceComplexe rezultat = new MatriceComplexe(this.linii, this.coloane);
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < this.coloane; j++) {
                rezultat.matrice[i][j] = this.matrice[i][j].scade(m.matrice[i][j]);
            }
        }
        return rezultat;
    }


    //inmultire cu scalar
    public MatriceComplexe multiplyByScalar(Complex scalar) {
        MatriceComplexe rezultat = new MatriceComplexe(this.linii, this.coloane);
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < this.coloane; j++) {
                rezultat.matrice[i][j] = this.matrice[i][j].inmulteste(scalar);
            }
        }
        return rezultat;
    }

    //inmultire matrici
    public MatriceComplexe multiplyMatrix(MatriceComplexe m) {
        if (this.coloane != m.linii) {
            throw new IllegalArgumentException("Dimensiunile matricelor nu sunt compatibile pentru inmultire.");
        }
        MatriceComplexe rezultat = new MatriceComplexe(this.linii, m.coloane);
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < m.coloane; j++) {
                Complex suma = new Complex(0, 0);
                for (int k = 0; k < this.coloane; k++) {
                    suma = suma.aduna(this.matrice[i][k].inmulteste(m.matrice[k][j]));
                }
                rezultat.matrice[i][j] = suma;
            }
        }
        return rezultat;
    }

    public void set(int i, int j, Complex c) {
        matrice[i][j] = c;
    }

    public Complex get(int i, int j) {
        return matrice[i][j];
    }

}