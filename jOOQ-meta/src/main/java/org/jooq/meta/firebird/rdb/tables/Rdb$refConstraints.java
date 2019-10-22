/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;
import org.jooq.meta.firebird.rdb.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$refConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = -1291928573;

    /**
     * The reference instance of <code>RDB$REF_CONSTRAINTS</code>
     */
    public static final Rdb$refConstraints RDB$REF_CONSTRAINTS = new Rdb$refConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>RDB$REF_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> RDB$CONSTRAINT_NAME = createField(DSL.name("RDB$CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$REF_CONSTRAINTS.RDB$CONST_NAME_UQ</code>.
     */
    public final TableField<Record, String> RDB$CONST_NAME_UQ = createField(DSL.name("RDB$CONST_NAME_UQ"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$REF_CONSTRAINTS.RDB$MATCH_OPTION</code>.
     */
    public final TableField<Record, String> RDB$MATCH_OPTION = createField(DSL.name("RDB$MATCH_OPTION"), org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$REF_CONSTRAINTS.RDB$UPDATE_RULE</code>.
     */
    public final TableField<Record, String> RDB$UPDATE_RULE = createField(DSL.name("RDB$UPDATE_RULE"), org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$REF_CONSTRAINTS.RDB$DELETE_RULE</code>.
     */
    public final TableField<Record, String> RDB$DELETE_RULE = createField(DSL.name("RDB$DELETE_RULE"), org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * Create a <code>RDB$REF_CONSTRAINTS</code> table reference
     */
    public Rdb$refConstraints() {
        this(DSL.name("RDB$REF_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>RDB$REF_CONSTRAINTS</code> table reference
     */
    public Rdb$refConstraints(String alias) {
        this(DSL.name(alias), RDB$REF_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>RDB$REF_CONSTRAINTS</code> table reference
     */
    public Rdb$refConstraints(Name alias) {
        this(alias, RDB$REF_CONSTRAINTS);
    }

    private Rdb$refConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$refConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(
              Internal.createUniqueKey(org.jooq.meta.firebird.rdb.tables.Rdb$refConstraints.RDB$REF_CONSTRAINTS, "RDB$INDEX_13", org.jooq.meta.firebird.rdb.tables.Rdb$refConstraints.RDB$REF_CONSTRAINTS.RDB$CONSTRAINT_NAME)
        );
    }

    @Override
    public Rdb$refConstraints as(String alias) {
        return new Rdb$refConstraints(DSL.name(alias), this);
    }

    @Override
    public Rdb$refConstraints as(Name alias) {
        return new Rdb$refConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$refConstraints rename(String name) {
        return new Rdb$refConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$refConstraints rename(Name name) {
        return new Rdb$refConstraints(name, null);
    }
}
