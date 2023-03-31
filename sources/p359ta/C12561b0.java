package p359ta;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ta.b0 */
/* compiled from: SqlCommand */
public class C12561b0 {

    /* renamed from: a */
    private final String f46083a;

    /* renamed from: b */
    private final List<Object> f46084b;

    public C12561b0(String str, List<Object> list) {
        this.f46083a = str;
        this.f46084b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: e */
    private Object[] m59797e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object f : list) {
                arrayList.add(m59798f(f));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: f */
    private static Object m59798f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public void mo37384a(SQLiteProgram sQLiteProgram) {
        List<Object> list = this.f46084b;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object f = m59798f(this.f46084b.get(i));
                int i2 = i + 1;
                if (f == null) {
                    sQLiteProgram.bindNull(i2);
                } else if (f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i2, (byte[]) f);
                } else if (f instanceof Double) {
                    sQLiteProgram.bindDouble(i2, ((Double) f).doubleValue());
                } else if (f instanceof Integer) {
                    sQLiteProgram.bindLong(i2, (long) ((Integer) f).intValue());
                } else if (f instanceof Long) {
                    sQLiteProgram.bindLong(i2, ((Long) f).longValue());
                } else if (f instanceof String) {
                    sQLiteProgram.bindString(i2, (String) f);
                } else if (f instanceof Boolean) {
                    sQLiteProgram.bindLong(i2, ((Boolean) f).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Could not bind " + f + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                }
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public List<Object> mo37385b() {
        return this.f46084b;
    }

    /* renamed from: c */
    public String mo37386c() {
        return this.f46083a;
    }

    /* renamed from: d */
    public Object[] mo37387d() {
        return m59797e(this.f46084b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12561b0)) {
            return false;
        }
        C12561b0 b0Var = (C12561b0) obj;
        String str = this.f46083a;
        if (str != null) {
            if (!str.equals(b0Var.f46083a)) {
                return false;
            }
        } else if (b0Var.f46083a != null) {
            return false;
        }
        if (this.f46084b.size() != b0Var.f46084b.size()) {
            return false;
        }
        for (int i = 0; i < this.f46084b.size(); i++) {
            if (!(this.f46084b.get(i) instanceof byte[]) || !(b0Var.f46084b.get(i) instanceof byte[])) {
                if (!this.f46084b.get(i).equals(b0Var.f46084b.get(i))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f46084b.get(i), (byte[]) b0Var.f46084b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f46083a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46083a);
        List<Object> list = this.f46084b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f46084b;
        }
        sb.append(str);
        return sb.toString();
    }
}
