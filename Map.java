/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaxonisack
 */
public class Map {
    
    private int rows, columns;
    
    public Map(int rows,int columns){
        this.rows=rows;
        this.columns=columns;
    }
    public void setRows(int rows){
        this.rows=rows;
    }
    public void setColumns(int columns){
        this.columns=columns;
    }
    public int getRows(){
        return this.rows;
    }
    public int getColumns(){
        return this.columns;
    }
}
