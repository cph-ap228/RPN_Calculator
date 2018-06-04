/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPN;

/**
 *
 * @author Maksymilian
 */
public class NumberPath<Integer> implements Path<Integer> {
    
    private Integer first;
    private NumberPath<Integer> rest;

    public NumberPath(Integer first, NumberPath rest){
        this.first = first;
        this.rest = rest;
    }
    
    @Override
    public Integer getFirst() {
        return first;
    }

    @Override
    public Path<Integer> getRest() {
        return rest;
    }

    
    @Override
    public String toString(){
        if(rest==null){
            return first+"";
        }
        String s = first+rest.toString();
        return s;
    }
    
    public Integer[] peekAll(Integer[] list, int i){
        list[i] = first;
        if(rest == null){    
            return list;
        }else{
            i++;
            rest.peekAll(list, i);
        }
        return list;
    }
    
} 
    

