//
// This file generated by rdl 1.4.6
//

package com.yahoo.rdl;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// NumberTypeDef - A number type definition allows the restriction of numeric
// values.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class NumberTypeDef {
    public String type;
    public String name;
    @RdlOptional
    public String comment;
    @RdlOptional
    public Map<String, String> annotations;
    @RdlOptional
    public Number min;
    @RdlOptional
    public Number max;

    public NumberTypeDef type(String type) {
        this.type = type;
        return this;
    }
    public NumberTypeDef name(String name) {
        this.name = name;
        return this;
    }
    public NumberTypeDef comment(String comment) {
        this.comment = comment;
        return this;
    }
    public NumberTypeDef annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public NumberTypeDef min(Number min) {
        this.min = min;
        return this;
    }
    public NumberTypeDef max(Number max) {
        this.max = max;
        return this;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != NumberTypeDef.class) {
                return false;
            }
            NumberTypeDef a = (NumberTypeDef) another;
            if (type == null ? a.type != null : !type.equals(a.type)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (comment == null ? a.comment != null : !comment.equals(a.comment)) {
                return false;
            }
            if (annotations == null ? a.annotations != null : !annotations.equals(a.annotations)) {
                return false;
            }
            if (min == null ? a.min != null : !min.equals(a.min)) {
                return false;
            }
            if (max == null ? a.max != null : !max.equals(a.max)) {
                return false;
            }
        }
        return true;
    }
}
