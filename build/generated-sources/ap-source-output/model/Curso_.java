package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, Integer> codigo;
	public static volatile ListAttribute<Curso, Aluno> alunos;
	public static volatile SingularAttribute<Curso, String> ementa;
	public static volatile SingularAttribute<Curso, String> descricao;

	public static final String CODIGO = "codigo";
	public static final String ALUNOS = "alunos";
	public static final String EMENTA = "ementa";
	public static final String DESCRICAO = "descricao";

}

