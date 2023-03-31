package p359ta;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p369ua.C12722a;

/* renamed from: ta.c0 */
/* compiled from: Utils */
public class C12563c0 {
    /* renamed from: a */
    public static List<Object> m59803a(Cursor cursor, int i) {
        String str;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object b = m59804b(cursor, i2);
            if (C12722a.f46522c) {
                String str2 = null;
                if (b != null) {
                    if (b.getClass().isArray()) {
                        str2 = "array(" + b.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = b.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i2);
                sb.append(" ");
                sb.append(cursor.getType(i2));
                sb.append(": ");
                sb.append(b);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object m59804b(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i);
    }
}
