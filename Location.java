/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaxonisack
 */
public class Location {
    
    private int row;
    private int column;
    
    public Location(int row,int column){
        this.row=row; this.column=column;
    }
    public void setRow(int row){
        this.row=row;
    }
    public void setColumn(int column){
        this.column=column;
    }
    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }
}
