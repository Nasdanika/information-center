FROM centos

RUN yum update -y \
	&& yum install -y \
		java-1.8.0-openjdk-devel \
		graphviz \
	&& yum clean all 
		

COPY x86_64 /opt/nasdanika-information-center

RUN chmod a+x /opt/nasdanika-information-center/eclipse	

ENTRYPOINT ["/opt/nasdanika-information-center/eclipse"]

EXPOSE 8080