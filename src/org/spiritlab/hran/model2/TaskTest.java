package org.spiritlab.hran.model2;

import org.junit.Before;
import org.junit.Test;

public class TaskTest {

    Task task;
    
    // Первичный список - пример Мойка внесена, относится к категории для внесения в Финансы, в список Моек, в список дел сделанных, в календарь.
    
    @Before
    public void setUp() throws Exception {
        
        task = new Task("Мойка машины");
        task.addProperty(Category.TIME, "20.01.2016");
        task.addProperty(Category.COST, "350р");
        
        task.addObjective(Objective.FINANCE).addObjective(Objective.EVENT).addObjective(Objective.KALEDAR).addObjective(Objective.WASHING);
        
    }

    @Test
    public void testExist() {
        
        assert(task != null);
        
        //assert(task.existProperty(Category.COST));
        
    }

}