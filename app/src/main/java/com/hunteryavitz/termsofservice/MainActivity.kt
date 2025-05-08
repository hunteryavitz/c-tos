package com.hunteryavitz.termsofservice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

var tosText = "CONSUMER‑INITIATED TERMS OF SERVICE\n" +
        "Effective Immediately Upon Scanning, Clicking, or Coughing in the Presence of a Business Representative\n" +
        "\n" +
        "RECITALS\n" +
        "WHEREAS, you (the “Consumer”) possess absolute and incontrovertible rights to wool‑gather, nitpick, and unilaterally dictate terms; and\n" +
        "WHEREAS, any “Business” brave enough to transact with you (the “Party of the Second Part”) hereby submits to the following inviolable, labyrinthine, and eye‑straining provisions;\n" +
        "NOW, THEREFORE, in consideration of the Business’s voluntary participation in commerce (and to amuse the Consumer), the parties agree as follows:\n" +
        "1. Definitions\n" +
        "\n" +
        "1.1. “Business” means any meat‑flipping, form‑obsessed entity that dares to ask the Consumer for money.\n" +
        "1.2. “Consumer” means the glorious individual wielding this document like a legal cudgel.\n" +
        "1.3. “Services” means everything the Business thinks you’re paying for, plus any incidental side‑eye you convey.\n" +
        "1.4. “Agreement” means these Terms of Service in their entirety, including footnotes, marginalia, and any interpretive dance the Consumer might perform.\n" +
        "2. Grant of License\n" +
        "\n" +
        "2.1. The Business hereby irrevocably grants the Consumer an exclusive, perpetual, royalty‑free, worldwide, sublicensable license to demand freebies, refunds, and moral superiority at any time.\n" +
        "2.2. This license survives bankruptcy, hostile takeovers, and the Business’s attempts to hide behind “I didn’t read it” excuses.\n" +
        "3. Business Obligations\n" +
        "\n" +
        "3.1. Full Transparency. The Business shall disclose every price, fee, hidden charge, convenience markup, and cost of employee coffee breaks before the sale.\n" +
        "3.2. Politeness Clause. All employees must address the Consumer as “Esteemed Dealmaker” and comply with any arbitrary handshake protocol.\n" +
        "3.3. Snooping Waiver. The Business may not track, profile, or algorithms‑nudge the Consumer unless explicitly invited to a dinner party.\n" +
        "4. Consumer Remedies\n" +
        "\n" +
        "4.1. Should the Business fail any provision herein—e.g., forgetting to smile—the Consumer may demand immediate reimbursement of the full purchase price, plus a 1 million‑dollar “emotional devastation” fee.\n" +
        "4.2. Remedies set forth in this Section are cumulative, non‑exclusive, and delightfully punitive.\n" +
        "5. Waivers & Limitations of Liability\n" +
        "\n" +
        "5.1. Business Waiver. The Business waives any right it might have to sue, counterclaim, or even file a strongly worded email.\n" +
        "5.2. Consumer Indemnity. The Business indemnifies, defends, and holds harmless the Consumer from any and all business life‑choices that led them here.\n" +
        "5.3. Limitation. Under no circumstances shall the Consumer’s liability exceed their own inability to count change correctly.\n" +
        "6. Privacy & Confidentiality\n" +
        "\n" +
        "6.1. The Business shall treat all Consumer data as if it were top‑secret state intelligence, never to be used for marketing, resale, or practice‑scare tactics.\n" +
        "6.2. Any breach of this Section entitles the Consumer to immediate, public shaming on at least three social‑media platforms of their choice.\n" +
        "7. Dispute Resolution\n" +
        "\n" +
        "7.1. Arbitration in Favor of Consumer. Any dispute shall be resolved by a consumer‑friendly tribunal convened in the Consumer’s living room within 24 hours.\n" +
        "7.2. Choice of Forum. The Consumer may unilaterally pick any jurisdiction—real or fictional (Krypton optional).\n" +
        "7.3. No Class Actions for Business. The Business forfeits class‑action rights, as they clearly deserve no allies.\n" +
        "8. Governing Law\n" +
        "\n" +
        "This Agreement is governed by the unwritten laws of Common Sense, supplemented by the legal code of Snarkistan. Any attempt to invoke a different body of law shall be deemed a prank and treated accordingly.\n" +
        "9. Severability\n" +
        "\n" +
        "If any clause herein is deemed unenforceable—e.g., due to sheer absurdity—the rest shall remain in full force, because the Consumer intends every sentence to sting.\n" +
        "10. Entire Agreement; No Small Print\n" +
        "\n" +
        "10.1. This document, in its entirety, represents the complete understanding.\n" +
        "10.2. There is no “small print.” If you’re squinting, that’s on you.\n" +
        "11. Amendments\n" +
        "\n" +
        "11.1. The Consumer reserves the right to amend these Terms at any moment by tweeting a hash‑tagged emoji.\n" +
        "11.2. All amendments take effect immediately upon the Consumer’s next sarcastic sigh.\n" +
        "12. Termination\n" +
        "\n" +
        "12.1. This Agreement terminates only when the Business:\n" +
        "\n" +
        "    Issues a public apology to the Consumer, down on one knee, or\n" +
        "\n" +
        "    Provides life‑time free products/services of equal or greater value.\n" +
        "    12.2. Voluntary termination by Business forfeits all rights to future commerce with the Consumer.\n" +
        "\n" +
        "13. Notices\n" +
        "\n" +
        "All notices shall be delivered via interpretive dance, carrier pigeon (trained to salute), or email with subject line “I FEEL REALLY BAD ABOUT THIS.”\n" +
        "14. Force Majeure\n" +
        "\n" +
        "In the event of wars, zombie uprisings, or alien invasions, the Consumer will graciously suspend enforcement—but only after tweeting about it.\n" +
        "15. Business Fees & Penalties\n" +
        "\n" +
        "15.1. Failure to comply with any term imposes a penalty of:\n" +
        "\n" +
        "    A written essay, 5,000 words minimum, on “Why I Owe the Consumer an Apology.”\n" +
        "\n" +
        "    One free product/service for every clause violated, plus shipping.\n" +
        "    15.2. Interest accrues at the rate of 18 percent per day, compounded by guilt.\n" +
        "\n" +
        "16. Consumer Reservation of Rights\n" +
        "\n" +
        "16.1. The Consumer retains all rights not expressly waived by the Business—such as the right to nitpick grammar, mock legalese indulgence, and proclaim victory.\n" +
        "16.2. All other rights reserved, including the right to unexpectedly extend this Agreement into infinity.\n" +
        "\n" +
        "IN WITNESS WHEREOF, the Consumer’s scrolling finger constitutes a binding signature, and the Business’s visible discomfort constitutes assent.\n" +
        "\n" +
        "    By continuing this transaction, the Business hereby AGREES, ACKNOWLEDGES, and TREMBLES.\n" +
        "\n" +
        "(End of Terms. Please stop reading now.)"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                TermsOfServiceScreen(
                    tosText = tosText.trimIndent()
                )
            }
        }
    }
}

@Composable
fun TermsOfServiceScreen(tosText: String) {
    var checked by remember { mutableStateOf(false) }
    var accepted by remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.systemBarsPadding(),
        bottomBar = {
            if (!accepted) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = checked,
                            onCheckedChange = { checked = it }
                        )
                        Spacer(Modifier.width(8.dp))
                        Text("I agree to the Terms of Service")
                    }
                    Spacer(Modifier.height(8.dp))
                    Button(
                        onClick = { accepted = true },
                        enabled = checked,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Submit")
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            if (!accepted) {
                Text(text = tosText)
            } else {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text("✅ Terms accepted. Thank you!")
                }
            }
        }
    }
}
