package p163x;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: x.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C5987c extends C5982a {

    /* renamed from: i */
    private int f29207i;

    /* renamed from: r */
    private int f29208r;

    /* renamed from: s */
    private LayoutInflater f29209s;

    @Deprecated
    public C5987c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f29208r = i;
        this.f29207i = i;
        this.f29209s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo20692g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f29209s.inflate(this.f29208r, viewGroup, false);
    }

    /* renamed from: h */
    public View mo2625h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f29209s.inflate(this.f29207i, viewGroup, false);
    }
}
