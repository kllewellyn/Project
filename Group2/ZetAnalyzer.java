/**
 *  Provides static methods for finding sets.
 */

/*

  Tips:

  - Given a, b, c from {1, 2, 3}, they are all equal or all different if and only if
    (a + b + c) % 3 == 0.  This property can be used for testing three cards for a set
    easily.

    (For more mathematically inclined, the SET deck corresponds to the 4-dimensional vector
    space over the algebraic field {0, 1, 2} with modulo 3 arithmetic.  Three cards form a "set"
    if and only if the sum of the corresponding vectors is 0.)

  - isZet and findZet are static methods.

  - in isZet, don't forget to check that the cards are not all the same.

  - Note that an array passed to findZet can have nulls in some of the elements.

   Represents a card for the game of Set. A card has four attributes: 
   number: (1, 2, or 3), shape: (oval, squiggle, or diamond), fill (outlined, solid, or striped), 
   and color (red, green, or blue). Each attribute is represented by an integer code from 1 to 3. 

*/

public class ZetAnalyzer
{

  public ZetAnalyzer()
  {

  }

  public static int[] findZet(ZetCard[] cards)
  {
    for (int j = 0; j < cards.length; j++)
    {
      for(int k = 0; k < cards.length; k++)
      {
        for (int i = 0; i < cards.length; j++)
        {
          if (isZet(cards[i], cards[k], cards[j]))
            int[] arr = {i, j, k}
            return arr
        }
      }
    }
  }

  public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
  {
    if (card1.toString().equals(card2.toString) && card2.toString().equals(card3.toString))
      return false;
    boolean colorSet = (card1.getColor() + card2.getColor() + card3.getColor()) % 3 == 0;
    boolean fillSet = (card1.getFill() + card2.getFill() + card3.getFill()) % 3 == 0;
    boolean shapeSet = (card1.getShape() + card2.getShape() + card3.getShape()) % 3 == 0;
    boolean numberSet = (card1.getNumber() + card2.getNumber() + card3.getNumber()) % 3 == 0;
    return colorSet && fillSet && shapeSet && numberSet;
  }



}
