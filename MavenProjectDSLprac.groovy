job('FIrst-maven-project-dsl'){
	description('My first sample project using dsl with maven')
	scm{
	    git('https://github.com/Simran18randhawa/Jenkins_Upgradev3.git' , 'master')
	}
	triggers{
	         scm('* * * * *')
	}
	steps{
	      maven('clean package', 'maven_samples/single-module/pom.xml')
	}
	publishers{
	          archiveArtifacts('**/*.jar')
	}
}

