package ohi.andre.consolelauncher.tuils.interfaces;

/**
 * Created by andre on 25/07/15.
 */
public interface Outputable {
    void onOutput(CharSequence output, int category);
    void onOutput(CharSequence output);
}
