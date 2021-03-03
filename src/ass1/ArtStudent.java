/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;

/**
 *
 * @author Ma7moud
 */
class ArtStudent extends Student {

    double mid, report, finalM;

    public ArtStudent(int id, String name, String major, double mid, double report, double finalM) {
        super(id, name, major, mid * 0.40 + report * 0.10 + finalM * 0.50);
        this.mid = mid;
        this.report = report;
        this.finalM = finalM;
    }

    

}
