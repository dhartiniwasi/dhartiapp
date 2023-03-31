package p212d9;

import java.util.List;

/* renamed from: d9.e */
/* compiled from: DecodeHintType */
public enum C9913e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C9925q.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: a */
    private final Class<?> f39797a;

    private C9913e(Class<?> cls) {
        this.f39797a = cls;
    }
}
