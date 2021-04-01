package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile ListAttribute<Aluno, Curso> cursos;
	public static volatile SingularAttribute<Aluno, Integer> codigo;
	public static volatile SingularAttribute<Aluno, String> nome;

	public static final String CURSOS = "cursos";
	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";

}

