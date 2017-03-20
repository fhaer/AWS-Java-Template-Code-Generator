REM erstelle Queue und ConnectionFactory fuer DirektvertriebVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction DirektvertriebVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=DirektvertriebVS_QueuePhys DirektvertriebVS_Queue

REM erstelle Queue und ConnectionFactory fuer BestellungVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction BestellungVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=BestellungVS_QueuePhys BestellungVS_Queue

REM erstelle Queue und ConnectionFactory fuer AuftragsabwicklungVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction AuftragsabwicklungVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=AuftragsabwicklungVS_QueuePhys AuftragsabwicklungVS_Queue

REM erstelle Queue und ConnectionFactory fuer AuslieferungVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction AuslieferungVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=AuslieferungVS_QueuePhys AuslieferungVS_Queue

REM erstelle Queue und ConnectionFactory fuer FinanzwesenVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction FinanzwesenVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=FinanzwesenVS_QueuePhys FinanzwesenVS_Queue

REM erstelle Queue und ConnectionFactory fuer ProduktionVS_Queue
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction ProduktionVS_QueueCF
cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=ProduktionVS_QueuePhys ProduktionVS_Queue

pause
