package androidx.core.p010os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;

/* renamed from: androidx.core.os.d */
/* compiled from: Bundle.kt */
public final class C0762d {
    /* renamed from: a */
    public static final Bundle m3511a(C10340l<String, ? extends Object>... lVarArr) {
        C11669k.m56787e(lVarArr, "pairs");
        Bundle bundle = new Bundle(lVarArr.length);
        for (C10340l<String, ? extends Object> lVar : lVarArr) {
            String a = lVar.mo33173a();
            Object b = lVar.mo33174b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                C11669k.m56784b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C11669k.m56785c(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C11669k.m56785c(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C11669k.m56785c(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a, (Serializable) b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(a, (Serializable) b);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 18 && (b instanceof IBinder)) {
                    C0760b.m3508a(bundle, a, (IBinder) b);
                } else if (i >= 21 && (b instanceof Size)) {
                    C0761c.m3509a(bundle, a, (Size) b);
                } else if (i < 21 || !(b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
                } else {
                    C0761c.m3510b(bundle, a, (SizeF) b);
                }
            }
        }
        return bundle;
    }
}
