package de.mintware.barcode_scan;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by carlosrios on 12/30/16.
 */
public class OpenSansButton extends androidx.appcompat.widget.AppCompatButton {

    public OpenSansButton(Context context) {
        super(context);

        init();
        setTypeface(getFontType(getContext(), "OpenSans-Bold.ttf"));

    }
    public OpenSansButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OpenSansButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    private void init() {
        setTypeface(getFontType(getContext(), "OpenSans-Bold.ttf"));

    }
    public static Typeface getFontType(Context context, String font){
        return Typeface.createFromAsset(context.getAssets(), "fonts/" + font);
    }
}

