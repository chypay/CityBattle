/**
 * 
 */
package edu.nwpu.citybattle.actions;

/**
 * 这个接口用于Timer刷新时对可移动目标进行位置属性更新<br />
 * 每次定时任务Timer执行时会调用目标对象的{@code moveNext()}方法<br />
 * 实现该接口的类应该完善此方法，使其能更新对象的位置属性，让其能在绘制时更改位置。
 * @author Orangii
 * @version 1.0.0
 */
public interface Movable {
	
	/**
	 * 本方法将在定时任务中调用，实现方法时应当完成对对象位置属性进行更新<br />
	 * 位置属性应在对象内完成，以实现渲染时对象位置的更新。
	 * @since 1.0.0
	 */
	void moveNext();
}
