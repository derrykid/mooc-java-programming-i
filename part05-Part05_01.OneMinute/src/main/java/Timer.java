/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derry
 */
public class Timer {

	private ClockHand hundredth;
	private ClockHand seconds;

	public Timer() {
		this.hundredth = new ClockHand(100);
		this.seconds = new ClockHand(60);
	}

	public void advance() {
		this.hundredth.advance();
		if (this.hundredth.value() == 0) {
			this.seconds.advance();
		}
	}

	public String toString(){
		return this.seconds + ":" + this.hundredth;

	}
}
