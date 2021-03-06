package topcoder

import org.junit.Test
import org.junit.Assert._

/**
 * Little Fox Jiro has a rectangular board. On the board there is a row of N unit cells. 
 * The cells are numbered 0 through N-1 from the left to the right. Initially, the cells 
 * are not colored. Jiro must color each of the cells red, green, or blue.
 * 
 * You are given a String desiredColor with N characters. For each i, character i of 
 * desiredColor represents the color Jiro must use for cell i. If a character is one 
 * of 'R' (as red), 'G' (as green), and 'B' (as blue), it means that Jiro must use that 
 * particular color. If a character is '*', Jiro may use any of the three colors for the particular cell
 * 
 * You are also given the ints stampCost and pushCost that describe the cost of the 
 * coloring process. The coloring process consists of two phases. In the first phase, 
 * Jiro must pick a single stamp he will then use to color all the cells. The length L 
 * of the stamp can be any integer between 1 and N, inclusive. A stamp of length L costs L*stampCost.
 * 
 * In the second phase, Jiro must repeatedly use the stamp to color the cells. 
 * Each use of the stamp works as follows:
 * 
 * Jiro picks one of the three colors and pushes the stamp into ink of the chosen color C.
 * 
 * Jiro picks a segment of L contiguous cells such that each of them is either uncolored 
 * or already has the color C. The segment must be completely inside the board. That is, 
 * the leftmost cell of the segment must be one of the cells 0 through N-L.
 * 
 * Jiro pushes the stamp onto the chosen segment of cells. All the cells now have color C.
 * 
 * Each use of the stamp costs pushCost.
 * 
 * Return the smallest possible total cost of coloring all the cells using the above process.
 * 
 * Constraints
 * -	desiredColor will contain between 1 and 50 characters, inclusive.
 * -	Each character of desiredColor will be either 'R' or 'G' or 'B' or '*'.
 * -	stampCost will be between 1 and 100,000, inclusive.
 * -	pushCost will be between 1 and 100,000, inclusive.
 */
class Stamp {

  def getMinimumCost(desiredColor: String , stampCost: Int, pushCost: Int): Int = {
    0
  }
  
  @Test def test0() { assertEquals(5, getMinimumCost("RRGGBB", 1, 1)) }
  @Test def test1() { assertEquals(5, getMinimumCost("R**GB*", 1, 1)) }
  @Test def test2() { assertEquals(30, getMinimumCost("BRRB", 2, 7)) }
  @Test def test3() { assertEquals(204, getMinimumCost("R*RR*GG", 10, 58)) }
  @Test def test4() { assertEquals(33, getMinimumCost("*B**B**B*BB*G*BBB**B**B*", 5, 2)) }
  @Test def test5() { assertEquals(30, getMinimumCost("*R*RG*G*GR*RGG*G*GGR***RR*GG", 7, 1)) }
}