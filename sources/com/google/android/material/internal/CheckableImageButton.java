package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0534p;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import p048g.C4288a;
import p169y.C6079a;

public class CheckableImageButton extends C0534p implements Checkable {

    /* renamed from: g */
    private static final int[] f33762g = {16842912};

    /* renamed from: d */
    private boolean f33763d;

    /* renamed from: e */
    private boolean f33764e;

    /* renamed from: f */
    private boolean f33765f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C7694a extends C0832a {
        C7694a() {
        }

        /* renamed from: f */
        public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3230f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            cVar.mo3291V(CheckableImageButton.this.mo25658a());
            cVar.mo3292W(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C7695b extends C6079a {
        public static final Parcelable.Creator<C7695b> CREATOR = new C7696a();

        /* renamed from: c */
        boolean f33767c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C7696a implements Parcelable.ClassLoaderCreator<C7695b> {
            C7696a() {
            }

            /* renamed from: a */
            public C7695b createFromParcel(Parcel parcel) {
                return new C7695b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C7695b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7695b(parcel, classLoader);
            }

            /* renamed from: c */
            public C7695b[] newArray(int i) {
                return new C7695b[i];
            }
        }

        public C7695b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m42869b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f33767c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f33767c ? 1 : 0);
        }

        public C7695b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m42869b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23750C);
    }

    /* renamed from: a */
    public boolean mo25658a() {
        return this.f33764e;
    }

    public boolean isChecked() {
        return this.f33763d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f33763d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f33762g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7695b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7695b bVar = (C7695b) parcelable;
        super.onRestoreInstanceState(bVar.mo20873a());
        setChecked(bVar.f33767c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C7695b bVar = new C7695b(super.onSaveInstanceState());
        bVar.f33767c = this.f33763d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f33764e != z) {
            this.f33764e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f33764e && this.f33763d != z) {
            this.f33763d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f33765f = z;
    }

    public void setPressed(boolean z) {
        if (this.f33765f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f33763d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33764e = true;
        this.f33765f = true;
        C0835a0.m3741n0(this, new C7694a());
    }
}
