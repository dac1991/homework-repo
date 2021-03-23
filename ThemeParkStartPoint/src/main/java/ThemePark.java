import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;


    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewed = new ArrayList<>();
    }


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int getAttractionsCount() {
        return this.attractions.size();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public int getStallsCount() {
        return this.stalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        for(Attraction attraction : this.attractions){
            this.reviewed.add(attraction);
        }
        for(Stall stall : this.stalls){
            this.reviewed.add(stall);
        }
        return this.reviewed;
    }

    public int getReviewedCount() {
        return this.reviewed.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.visitAttraction(attraction);
    }
}