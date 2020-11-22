package states;


import entity.Player;

/**
 * Common interface for all states.
 */
public abstract class State {

  public Player player;

  /**
   * Context passes itself through the state constructor. This may help a
   * state to fetch some useful context data if needed.
   */
  public State(Player player) {
    this.player = player;
  }


  /**
   * Change the player to LOCK state
   * @return
   */
  public abstract String onLock();

  /**
   * Change the player to PLAYING state
   * @return
   */
  public abstract String onPlay();

  /**
   *
   * @return
   */
  public abstract String onNext();

  /**
   *
   * @return
   */
  public abstract String onPrevious();
}
