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
class ItStudent extends Student {

    double midMarks, projectMarks, finalMarks;

    public ItStudent(int id, String name, String major, double mid, double project, double finalM) {
        super(id, name, major, (mid * 0.30 + project * 0.30 + finalM * 0.40));
        this.midMarks = mid;
        this.projectMarks = project;
        this.finalMarks = finalM;
    }

}
