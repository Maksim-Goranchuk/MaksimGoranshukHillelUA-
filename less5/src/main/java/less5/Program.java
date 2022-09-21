package less5;

import less5.model.Cat;
import less5.model.Human;
import less5.model.Obstacle;
import less5.model.ObstacleCourse;
import less5.model.Road;
import less5.model.Robot;
import less5.model.Team;
import less5.model.Wall;

public class Program {

    public static void main(String[] args) {
        Team team1= new Team("Hillel1");
        team1.addSportsmam( new Human("Maksim ",400,0.9));
        team1.addSportsmam( new Cat("Serhii", 120, 0.5));
        team1.addSportsmam( new Robot("MSI",2000,1.8));
        Team team2 = new Team("Hillel1");
        team2.addSportsmam( new Human("Sasha",800,0.5));
        team2.addSportsmam( new Cat("Mikulish", 500, 0.9));
        team2.addSportsmam( new Robot("Hp",180,0.3));
        // Полоса препятствий
        ObstacleCourse course1=new ObstacleCourse();
        course1.obstacleAdd(new Obstacle(new Wall(0.2), new Road(100)));
        course1.obstacleAdd(new Obstacle(new Wall(0.8), new Road(300)));
        course1.obstacleAdd(new Obstacle(new Wall(1.5), new Road(1500)));
        // первая команда
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());
        //  вторая команда
        team2.getTeamInfo();
        team2.startCompetition(course1.getObstacles());
        // победитель
        team1.getWinner();
        team2.getWinner();
    }
}
