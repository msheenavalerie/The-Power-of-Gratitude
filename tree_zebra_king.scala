//1
import java.util.Scanner

//2
object ThePowerOfGratitude {
 
 //3
 def main(args: Array[String]): Unit = {
  
  //4
  println("Welcome to The Power of Gratitude program.");

  //5
  val scanner = new Scanner(System.in);

  //6
  println("What are you grateful for?");
  val response = scanner.nextLine();

  //7
  println(s"Very nice! I'm glad that you are grateful for $response.");
  
  //8
  println("What else are you grateful for?");
  val response2 = scanner.nextLine();
  
  //9
  println(s"Yes! It's great to be grateful for $response2.");
  
  //10
  println("Can you tell me one more thing?");
  val response3 = scanner.nextLine();
  
  //11
  println(s"Wonderful! I'm grateful for $response3 too!");
  
  //12
  println("Now, can you tell me one more thing?");
  val response4 = scanner.nextLine();
  
  //13
  println(s"It's wonderful to be grateful for $response4!")
  
  //14
  println("Now, can you name one more thing that you are grateful for?");
  val response5 = scanner.nextLine();
  
  //15
  println(s"That's great! I'm also grateful for $response5.");
  
  //16
  println("Simply amazing! Now, can you name one last thing?");
  val response6 = scanner.nextLine();
  
  //17
  println(s"Yes! I'm glad you are grateful for $response6.");
  
  //18
  println("It is great to take a moment to reflect on what you are grateful for.");
  
  //19
  println("This is The Power of Gratitude program. Have a great day!");
  
  //20
  scanner.close();
 }

//21
def printGratefulMessage(message: String): Unit = {
  println(s"I'm glad you are grateful for $message.")
 }
  
 //22
 def gratitudeChecker(grateful: Boolean): Boolean = {
   if(grateful) true else false
 }
 
 //23
 def thankfulTo(person: String): Unit = {
  println(s"I'm thankful to $person for being in my life.")
 }
  
 //24
 def showAppreciation(thing: String): Unit = {
  println(s"I appreciate $thing.")
 }
 
 //25
 def reflectOnGratitude(): Unit = {
  println("Take a moment to reflect on what you are grateful for.")
 }
 
 //26
 def thankSomeoneSpecial(): Unit = {
  println("Thank someone special in your life.")
 }
 
 //27
 def createGratitudeList(): Unit = {
  println("Create a gratitude list of things you are grateful for.")
 }
 
 //28
 def expressGratitude(): Unit = {
  println("Express gratitude to the world around you.")
 }
 
 //29
 def giveThanks(): Unit = {
  println("Give thanks to the people in your life.")
 }
 
 //30
 def expressGratitudeToTheUniverse(): Unit = {
  println("Express gratitude to the universe for all the gifts in your life.")
 }
 
 //31
 def reflectOnGratitudeForOthers(): Unit = {
  println("Reflect on what you are grateful for others.")
 }
 
 //32
 def expressAppreciationForNature(): Unit = {
  println("Express appreciation for nature and the world around us.")
 }
 
 //33
 def fosterAwarenessOfGratitude(): Unit = {
  println("Foster awareness of your gratitude every day.")
 }
 
 //34
 def practiceGratitudeJournaling(): Unit = {
  println("Practice gratitude journaling to help build your appreciation.")
 }
 
 //35
 def beGratefulForEverything(): Unit = {
  println("Be grateful for everything, both the good and the bad.")
 }
 
 //36
 def tellSomeoneYouAreGrateful(): Unit = {
  println("Tell someone you are grateful for them.")
 }
 
 //37
 def showGratitudeToYourself(): Unit = {
  println("Show gratitude to yourself for all your accomplishments.")
 }
 
 //38
 def useGratitudeToInspireOthers(): Unit = {
  println("Use gratitude to inspire others with your positive attitude.")
 }
 
 //39
 def practiceGratitudeInYourDailyLife(): Unit = {
  println("Practice gratitude in your daily life to boost your happiness.")
 }
 
 //40
 def recognizeGratitudeInOthers(): Unit = {
  println("Recognize gratitude in others and affirm their positive feelings.")
 }
 
 //41
 def startGratitudeChainReactions(): Unit = {
  println("Start gratitude chain reactions by sharing your grateful moments.")
 }
 
 //42
 def showGratitudeForOpportunities(): Unit = {
  println("Show gratitude for opportunities to learn and grow.")
 }
 
 //43
 def shareYourGratitude(): Unit = {
  println("Share your gratitude with others to help them feel thankful and appreciated.")
 }
 
 //44
 def turnTowardsGratitude(): Unit = {
  println("Turn towards gratitude and cultivate an attitude of appreciation.")
 }
 
 //45
 def recognizeThePowerOfGratitude(): Unit = {
  println("Recognize the power of gratitude and its ability to spread good feelings.")
 }
 
 //46
 def cultivateAHabittoBeMoreThankful(): Unit = {
  println("Cultivate a habit to be more thankful and appreciative of life.")
 }
 
 //47
 def benefitFromGratitudeInYourLife(): Unit = {
  println("Benefit from the power of gratitude in your life and feel happier.")
 }
 
 //48
 def useGratitudeToBreakNegativeThoughts(): Unit = {
  println("Use gratitude to break negative thoughts and create positive ones.")
 }
 
 //49
 def beThankfulForYourJourney(): Unit = {
  println("Be thankful for your journey and cherish your experiences.")
 }
 
 //50
 def valueTheSmallThingsToo(): Unit = {
  println("Value the small things too and be appreciative of them.")
 }
 
 //51
 def giveThanksMoreOften(): Unit = {
  println("Give thanks more often even for the simple pleasures of life.")
 }
 
 //52
 def practiceGratitudeEveryDay(): Unit = {
  println("Practice gratitude every day and make it a habit for life.")
 }
 
 //53
 def recognizeGratitudeInEveryMoment(): Unit = {
  println("Recognize gratitude in every moment and be aware of your blessings.")
 }
 
 //54
 def makeGratitudePartOfYourLife(): Unit = {
  println("Make gratitude part of your life and reap its rewards.")
 }
 
 //55
 def turnNegativeEmotionsIntoGratitude(): Unit = {
  println("Turn negative emotions into gratitude and use it to boost your happiness.")
 }
 
 //56
 def useGratitudeToBringJoy(): Unit = {
  println("Use gratitude to bring joy into your life and find contentment.")
 }
 
 //57
 def showGratitudeForTheLittleThings(): Unit = {
  println("Show gratitude for the little things and enjoy them more.")
 }
 
 //58
 def makeGratitudeAwayOfLiving(): Unit = {
  println("Make gratitude a way of living and share it with the world.")
 }
 
 //59
 def beGratefulForThePresentMoment(): Unit = {
  println("Be grateful for the present moment and all it brings to you.")
 }
 
 //60
 def carryGratitudeInYourHeart(): Unit = {
  println("Carry gratitude in your heart and carry it with you everywhere you go.")
 }
 
 //61
 def useGratitudeToHelpOthers(): Unit = {
  println("Use gratitude to help others feel more appreciated and loved.")
 }
 
 //62
 def practiceGratitudeToFeelFulfilled(): Unit = {
  println("Practice gratitude to feel fulfilled and happier in life.")
 }
 
 //63
 def liveWithAnAttitudeOfGratitude(): Unit = {
  println("Live with an attitude of gratitude and make it your life motto.")
 }
 
 //64
 def makeGratitudeARitual(): Unit = {
  println("Make gratitude a ritual and be thankful every day.")
 }
 
 //65
 def expressGratitudeToYourself(): Unit = {
  println("Express gratitude to yourself for all that you have achieved.")
 }
 
 //66
 def spreadGratitudeThroughActsofKindness(): Unit = {
  println("Spread gratitude through acts of kindness and compassion.")
 }
 
 //67
 def developAStrongerSenseOfGratitude(): Unit = {
  println("Develop a stronger sense of gratitude and be aware of its potential.")
 }
 
 //68
 def useGratitudeToAchieveYourGoals(): Unit = {
  println("Use gratitude to achieve your goals and live your best life.")
 }
 
 //69
 def createHeritageOfGratitude(): Unit = {
  println("Create a heritage of gratitude and share it with your descendants.")
 }
 
 //70
 def useGratitudeInDifficultSituations(): Unit = {
  println("Use gratitude in difficult situations and find peace in them.")
 }
 
 //71
 def reapTheBenefitsOfGratitude(): Unit = {
  println("Reap the benefits of gratitude and transform your life.")
 }
 
 //72
 def cultivateGratitudeInYourLife(): Unit = {
  println("Cultivate gratitude in your life and be happier and more content.")
 }
 
 //73
 def useGratitudeInEveryAspectOfLife(): Unit = {
  println("Use gratitude in every aspect of life and make it part of your daily routine.")
 }
 
 //74
 def honorYourGratitudewithActions(): Unit = {
  println("Honor your gratitude with actions and inspire others to be thankful.")
 }
 
 //75
 def recognizeTheBlessingsInLife(): Unit = {
  println("Recognize the blessings in life and appreciate them more.")
 }
 
 //76
 def beMindfulOfGratitude(): Unit = {
  println("Be mindful of gratitude and be aware of its potential to transform your life.")
 }
 
 //77
 def showYourAppreciationForOthers(): Unit = {
  println("Show your appreciation for others and make them feel special.")
 }
 
 //78
 def cultivateGratitudeInDailyLife(): Unit = {
  println("Cultivate gratitude in daily life and find joy in the small things.")
 }
 
 //79
 def bringGratitudeToYourRelationships(): Unit = {
  println("Bring gratitude to your relationships and nurture them with love.")
 }
 
 //80
 def spreadGratitudeInYourCommunity(): Unit = {
  println("Spread gratitude in your community and create a positive atmosphere.")
 }
 
 //81
 def expressGratitudeInYourWords(): Unit = {
  println("Express gratitude in your words and make others feel heard and appreciated.")
 }
 
 //82
 def useGratitudeAsAPowerfulTool(): Unit = {
  println("Use gratitude as a powerful tool to create a better world.")
 }
 
 //83
 def shareYourGratitudeWithOthers(): Unit = {
  println("Share your gratitude with others and bring them joy.")
 }
 
 //84
 def learnToBeGratefulForLife(): Unit = {
  println("Learn to be grateful for life and be thankful for every moment.")
 }
 
 //85
 def findGratitudeInEveryThing(): Unit = {
  println("Find gratitude in every thing and be aware of its potential.")
 }
  
 //86
 def createAnAttitudeOfGratitude(): Unit = {
  println("Create an attitude of gratitude and enjoy its benefits.")
 }
 
 //87
 def useGratitudeToBringPositiveChange(): Unit = {
  println("Use gratitude to bring positive change and create a better world.")
 }
 
 //88
 def practiceGratitudeInYourThoughts(): Unit = {
  println("Practice gratitude in your thoughts and be thankful for even the small things.")
 }
 
 //89
 def bringGratitudeToYourWork(): Unit = {
  println("Bring gratitude to your work and be mindful of your purpose.")
 }
 
 //90
 def transformNegativeEmotionsWithGratitude(): Unit = {
  println("Transform negative emotions with gratitude and be more positive.")
 }
 
 //91
 def practiceGratitudeInYourActions(): Unit = {
  println("Practice gratitude in your actions and make them more meaningful.")
 }
 
 //92
 def shareGratitudeToMakeOthersHappy(): Unit = {
  println("Share gratitude to make others happy and create a positive atmosphere.")
 }
 
 //93
 def discoverThePowerOfGratitude(): Unit = {
  println("Discover the power of gratitude and use it to transform your life.")
 }
 
 //94
 def findPeaceThroughGratitude(): Unit = {
  println("Find peace through gratitude and be more content with life.")
 }
 
 //95
 def spreadLoveThroughGratitude(): Unit = {
  println("Spread love through gratitude and bring joy to all.")
 }
 
 //96
 def beGratefulForYourBlessings(): Unit = {
  println("Be grateful for your blessings and cherish them.")
 }
 
 //97
 def encourageGratitudeInOthers(): Unit = {
  println("Encourage gratitude in others and help them be more thankful.")
 }
 
 //98
 def useGratitudeToAttractGoodThings(): Unit = {
  println("Use gratitude to attract good things and make them part of your life.")
 } 
  
 //99
 def createAChainofGratitude(): Unit = {
  println("Create a chain of gratitude and spread it to everyone.")
 }
 
 //100 
 def useGratitudeToTransformYourLife(): Unit = {
  println("Use gratitude to transform your life and be more content.")
 }
}