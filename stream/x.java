import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

private List<InvestmentComponentDTO> reorderReg(List<InvestmentComponentDTO> regularComponentInvestmentComponents,List<InvestmentComponentDTO> lumpSumInvestmentComponents )
    {
        List<InvestmentComponentDTO> UniqueLumpSumInvestmentComponents = lumpSumInvestmentComponents.stream()
                .distinct()
                .collect(Collectors.toList());

        Map<String,Integer> orderMap = new HashMap<>();
        for(int i = 0; i < UniqueLumpSumInvestmentComponents.size(); i++)
        {
            orderMap.put(UniqueLumpSumInvestmentComponents.get(i).getName(),i);
        }

        return regularComponentInvestmentComponents.stream()
                .sorted(Comparator.comparingInt(
                        p -> orderMap.getOrDefault(p.getName(),Integer.MAX_VALUE)
                ))
                .collect(Collectors.toList());
    }



     if (!ListUtils.emptyIfNull(regularComponentInvestmentComponents).isEmpty()) {

            regularComponentInvestmentComponents = reorderReg(regularComponentInvestmentComponents,drawdowns);




            private void setRegularComponentInvestmentComponents(
                Map<String, String> ret,
                List<InvestmentComponentDTO> regularComponentInvestmentComponents,
                List<InvestmentComponentDTO> drawdowns,
                FormTypeEnum productType,
                String client
        ) {