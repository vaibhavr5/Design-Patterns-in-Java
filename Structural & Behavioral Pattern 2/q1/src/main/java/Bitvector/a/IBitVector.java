package Bitvector.a;

/**
 * @author VAIBHAV
 *this interface is to implement the BitSet operations
 */
public interface IBitVector {

	/**
	 * @param i
	 * @return boolean
	 */
	public boolean get(int i);
	
	/**
	 * @param i
	 */
	public void set(int i);
	
	/**
	 * @param i
	 */
	public void clear(int i);
	
	/**
	 * @param b
	 */
	public void copy(BitVector b);
	
	/**
	 * @return int
	 */
	public int size();
	
	/**
	 * @return Iterator<Integer>
	 */
	public Iterator<Integer> iterator();
}
