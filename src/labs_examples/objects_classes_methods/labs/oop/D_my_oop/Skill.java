package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Skill {
    int skillCost;
    int [] skillDamageRange;
    int numberOfUses;
    String skillName;

    public int getSkillCost() {
        return skillCost;
    }

    public void setSkillCost(int skillCost) {
        this.skillCost = skillCost;
    }

    public int[] getSkillDamageRange() {
        return skillDamageRange;
    }

    public void setSkillDamageRange(int[] skillDamageRange) {
        this.skillDamageRange = skillDamageRange;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
