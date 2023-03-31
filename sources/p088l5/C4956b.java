package p088l5;

import android.os.IBinder;
import java.lang.reflect.Field;
import p033d5.C4141r;
import p088l5.C4954a;

/* renamed from: l5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4956b<T> extends C4954a.C4955a {

    /* renamed from: a */
    private final Object f26036a;

    private C4956b(Object obj) {
        this.f26036a = obj;
    }

    /* renamed from: P0 */
    public static <T> T m31384P0(C4954a aVar) {
        if (aVar instanceof C4956b) {
            return ((C4956b) aVar).f26036a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C4141r.m28221k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    /* renamed from: o3 */
    public static <T> C4954a m31385o3(T t) {
        return new C4956b(t);
    }
}
