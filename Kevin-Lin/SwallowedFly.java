
/**
 * there was an old lady who swallowed a fly.
 * 
 * @author (Kevin Lin) 
 * @version (8/26/2015)
 */
public class SwallowedFly {
    public static void main (String[] args) {
        System.out.println("There was an old lady who swallowed a fly.");
        SwallowedFly();
        System.out.println();
        System.out.println("There was an old lady who swallowed a spider,");
        SpiderFly();
        SwallowedFly();
        System.out.println();
        System.out.println("There was an old lady who swallowed a bird.");
        System.out.println("How absurd to swallow a bird.");
        BirdSpider();
        SpiderFly();
        SwallowedFly();
        System.out.println();
        System.out.println("There was and old lady who swallowed a cat.");
        System.out.println("Imagine that, she swallowed a cat.");
        CatBird();
        BirdSpider();
        SpiderFly();
        SwallowedFly();
        System.out.println();
        Horse();
    }
    
    public static void SwallowedFly() {
        System.out.println("I don't know why she swallowed the fly,");
        System.out.println("I guess she'll die.");
    }
    
    public static void SpiderFly() {
        System.out.println("that wiggled and wiggled and tickled inside her.");
        System.out.println("She swallowed the spider to catch the fly.");
    }
    
    public static void BirdSpider() {
        System.out.println("She swallowed the bird to catch the spider,");
    }
    
    public static void CatBird() {
        System.out.println("She swallowed the cat to catch the bird.");
    }
    
    public static void Horse() {
        System.out.println("There was an old lady who swallowed a horse.");
        System.out.println("She's dead, of course.");
    }
}
