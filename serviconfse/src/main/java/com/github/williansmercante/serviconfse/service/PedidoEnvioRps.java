package com.github.williansmercante.serviconfse.service;

public class PedidoEnvioRps {

    public String envioRps(String nota) {

        if(!nota.isEmpty()) {

            StringBuilder pedidoRps = new StringBuilder();

            pedidoRps.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            pedidoRps.append("<xs:schema targetNamespace=\"http://www.prefeitura.sp.gov.br/nfe\"");
            pedidoRps.append("xmlns:tipos=\"http://www.prefeitura.sp.gov.br/nfe/tipos\"");
            pedidoRps.append("xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"");
            pedidoRps.append("xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">");
            pedidoRps.append("<xs:element name=\"PedidoEnvioRPS\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Schema utilizado para PEDIDO de envio de RPS.</xs:documentation>");
            pedidoRps.append("<xs:documentation>Este Schema XML é utilizado pelos prestadores de serviços para substituição online e individual de RPS por NFS-e.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("<xs:complexType>");
            pedidoRps.append("<xs:sequence>");
            pedidoRps.append("<xs:element name=\"Cabecalho\" minOccurs=\"1\" maxOccurs=\"1\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Cabeçalho do pedido.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("<xs:complexType>");
            pedidoRps.append("<xs:sequence>");
            pedidoRps.append("<xs:element name=\"CPFCNPJRemetente\" type=\"tipos:tpCPFCNPJ\" minOccurs=\"1\" maxOccurs=\"1\">");
            pedidoRps.append("<xs:sequence>");
            pedidoRps.append("<xs:element name=\"CPFCNPJRemetente\" type=\"tipos:tpCPFCNPJ\" minOccurs=\"1\" maxOccurs=\"1\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Informe o CPF/CNPJ do Remetente autorizado a transmitir a mensagem XML.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("</xs:element>");
            pedidoRps.append("</xs:sequence>");
            pedidoRps.append("<xs:attribute name=\"Versao\" type=\"tipos:tpVersao\" use=\"required\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Informe a Versão do Schema XML utilizado.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("</xs:attribute>");
            pedidoRps.append("</xs:complexType>");
            pedidoRps.append("</xs:element>");
            pedidoRps.append("<xs:element name=\"RPS\" type=\"tipos:tpRPS\" minOccurs=\"1\" maxOccurs=\"1\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Informe o RPS a ser substituido por NFS-e.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("</xs:element>");
            pedidoRps.append("<xs:element ref=\"ds:Signature\" minOccurs=\"1\" maxOccurs=\"1\">");
            pedidoRps.append("<xs:annotation>");
            pedidoRps.append("<xs:documentation>Assinatura digital do contribuinte que gerou o RPS contido da mensagem XML.</xs:documentation>");
            pedidoRps.append("</xs:annotation>");
            pedidoRps.append("</xs:element>");
            pedidoRps.append("</xs:sequence>");
            pedidoRps.append("</xs:complexType>");
            pedidoRps.append("</xs:element>");
            pedidoRps.append("</xs:schema>");

            return pedidoRps.toString();
        }

        throw  new IllegalArgumentException("Nota Fiscal Inválida");
    }

    public static void main(String[] args) {

        PedidoEnvioRps pedidoEnvioRps = new PedidoEnvioRps();

        System.out.println(pedidoEnvioRps.envioRps("teste"));


    }

}
